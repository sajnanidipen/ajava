<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
<table border="1">
<tr>
<th>id</th>
<th>name</th>
<th>course</th>
<th>roll</th>
</tr>
<xsl:for-each select="college/student">
<tr>
<xsl:choose>
<xsl:when test="id &lt;4">
<td bgcolor="ff0000">
<td><xsl:value-of select="id"/></td>
<td><xsl:value-of select="name"/></td>
<td><xsl:value-of select="course"/></td>
<td><xsl:value-of select="roll"/></td>
</xsl:when>
<xsl:otherwise>
<td><xsl:value-of select="id"/></td>
</xsl:otherwise>
</xsl:choose>
<td><xsl:value-of select="name"/></td>
</tr>
</xsl:for-each>
</table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>