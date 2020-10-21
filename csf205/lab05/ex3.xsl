<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="Course_Catalog">
		<xsl:for-each select="Course">
			<xsl:value-of select="Title" />
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>
