<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xs" version="2.0">

    <xsl:template match="/">
        <metadata>
            <xsl:call-template name="GenerateDataTypes"/>
            <xsl:call-template name="GenerateEnums"/>
            <xsl:call-template name="GenerateClasses"/>
        </metadata>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the data types  ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateDataTypes">
        <datatypes>
            <xsl:for-each select="//schemaName">
                <xsl:call-template name="WriteDataTypes">
                    <xsl:with-param name="pDocument" select="text()"/>
                </xsl:call-template>
            </xsl:for-each>
        </datatypes>

    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the enumarations ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateEnums">
        <enums>
            <xsl:for-each select="//schemaName">
                <xsl:call-template name="WriteEnums">
                    <xsl:with-param name="pDocument" select="text()"/>
                </xsl:call-template>
            </xsl:for-each>

        </enums>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the classes      ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateClasses">
        <classes>
            <xsl:for-each select="//schemaName">
                <xsl:call-template name="WriteClasses">
                    <xsl:with-param name="pDocument" select="text()"/>
                </xsl:call-template>
            </xsl:for-each>
        </classes>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which writes the data types     ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WriteDataTypes">
        <xsl:param name="pDocument"/>
        <xsl:for-each select="document($pDocument)//xsd:complexType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:for-each select="//xsd:complexType[@name=$complexTypeName]//@base">
                <xsl:if test="contains(../@base, 'xsd:') or contains(../@base, 'javaee:')">
                    <xsl:text>&#10;</xsl:text>
                    <datatype>
                        <xsl:attribute name="complexTypeName">
                            <xsl:value-of select="$complexTypeName"/>
                        </xsl:attribute>
                        <xsl:attribute name="mappedTo">
                            <xsl:value-of select="../@base"/>
                        </xsl:attribute>
                        <xsl:attribute name="schemaName">
                            <xsl:value-of select="$pDocument"/>
                        </xsl:attribute>
                    </datatype>
                </xsl:if>
            </xsl:for-each>
        </xsl:for-each>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which writes the enumerations   ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WriteEnums">
        <xsl:param name="pDocument"/>
        <xsl:for-each select="document($pDocument)//xsd:complexType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:for-each select="xsd:simpleContent/xsd:restriction">
                <xsl:if test="@base='javaee:string'">
                    <xsl:for-each select="xsd:enumeration">
                        <xsl:if test="position() = 1">
                            <xsl:text>&#10;</xsl:text>
                            <enum>
                                <xsl:attribute name="complexTypeName">
                                    <xsl:value-of select="$complexTypeName"/>
                                </xsl:attribute>
                                <xsl:attribute name="schemaName">
                                    <xsl:value-of select="$pDocument"/>
                                </xsl:attribute>
                            </enum>
                        </xsl:if>
                    </xsl:for-each>
                </xsl:if>
            </xsl:for-each>
        </xsl:for-each>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which writes the classes        ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WriteClasses">
        <xsl:param name="pDocument"/>
        <xsl:for-each select="document($pDocument)//xsd:complexType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:for-each select="xsd:sequence/xsd:element">
                <xsl:if test="position() = 1">
                    <xsl:text>&#10;</xsl:text>
                    <class>
                        <xsl:attribute name="complexTypeName">
                            <xsl:value-of select="$complexTypeName"/>
                        </xsl:attribute>
                        <xsl:attribute name="schemaName">
                            <xsl:value-of select="$pDocument"/>
                        </xsl:attribute>
                    </class>
                </xsl:if>
            </xsl:for-each>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>
