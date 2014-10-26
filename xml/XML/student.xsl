<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<h2>Student Details Batch-11</h2>
				<table border="1">
					<tr bgcolor="#9acd32">
						<th style="text-align:left">Name</th>
						<th style="text-align:left">Reg_No</th>
						<th style="text-align:left">Course</th>
						<th style="text-align:left">Phone</th>
						<th style="text-align:left">email</th>
					</tr>
					<xsl:for-each select="academicYear/student">
						<tr>
							<td>
								<xsl:value-of select="name" />
							</td>
							<td>
								<xsl:value-of select="regNo" />
							</td>
							<td>
								<xsl:value-of select="course" />
							</td>
							<td>
								<xsl:value-of select="phone" />
							</td>
							<td>
								<xsl:value-of select="mail" />
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
	