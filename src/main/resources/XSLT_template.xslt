<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Информация о компании</title>
            </head>
            <body>
                <h1><xsl:value-of select="company/company_name"/></h1>
                <h2>Часы работы</h2>
                <p>Открыто с <xsl:value-of select="company/work_hours/open"/>
                    до <xsl:value-of select="company/work_hours/close"/>
                </p>

                <h2>Продукты компании</h2>
                <table>
                    <tr>
                        <th>Название</th>
                        <th>Тип кузова</th>
                        <th>Цена</th>
                        <th>Скидка</th>
                    </tr>
                    <xsl:for-each select="company/products/product">
                        <tr>
                            <td><xsl:value-of select="car_name"/></td>
                            <td><xsl:value-of select="car_body"/></td>
                            <td><xsl:value-of select="price"/></td>
                            <td><xsl:value-of select="discount"/>%</td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
