# CSF205 - Lab 04

## Task a

Return name of all ingredients
```
//rcp:ingredient/@name
```

Return the name of only the first ingredient
```
//rcp:recipe/rcp:ingredient[1]/@name
```
the above excludes ingredients of ingredients 

Extend the 2ndpart to the query to see if the name of this first ingredient is equal to “beef cube steak”. Note this expression should return true or false
```
I was unable to do it with just XPath
```

Return the name of all ingredients whose amount attribute has the value 1
```
//rcp:recipe/rcp:ingredient[@amount=1]/@name
```

List the id’sof all recipes that contain milk. Hint: make use of the parent axes
```
//rcp:ingredient[@name="milk"]/parent::rcp:recipe/@id
```
Since we have nested ingredients the below would be probably better
```
//rcp:ingredient[@name="milk"]/ancestor::rcp:recipe/@id
```

## Task b
an expression to find the total number of eggs needed
```
sum(//rcp:ingredient[contains(@name,"egg")]/@amount)
```

## Task c
Modify recipes.xml to include style. 
Line added:
```
<?xml-stylesheet type="text/xsl" href="recipes.xsl"?>
```

## Task d
Extend to include list of recipes at the top of the page. 

I have added the following template with mode 'top'
```
<xsl:template match="rcp:recipe" mode="top">
    <li><xsl:value-of select="@id" /> -- <xsl:value-of select="./rcp:title"/></li>
  </xsl:template>
```

and the following at the top of the body in the template for `rcp:collection` 
```
<ul>
    <xsl:apply-templates select="rcp:recipe" mode="top" />
</ul>
```

Since Chrome doesn't want to process XSLT i use `xmlstarlet` to transform the file and produce `recipes.html` with the following command 
```
xmlstarlet tr ./recipes.xsl ./recipes.xml > recipes.html
```