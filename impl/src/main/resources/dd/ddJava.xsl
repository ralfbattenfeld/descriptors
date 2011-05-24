<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
    xmlns:functx="http://www.functx.com"
    xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xs" version="2.0">
    <!--    <xsl:output method="text"/>-->
    <xsl:output method="text" indent="yes" media-type="text/plain"/>

    <xsl:variable name="vLower" select="'abcdefghijklmnopqrstuvwxyz'"/>
    <xsl:variable name="vUpper" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'"/>

    <xsl:template match="/">
        <xsl:call-template name="GenerateEnums"/>

        <!--          <xsl:call-template name="GenerateGroups"/>
            <xsl:call-template name="GenerateClasses"/>-->

    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the interfaces   ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateInterfaces">
            <xsl:for-each select="//groups/group">
                
               <!-- <xsl:call-template name="WriteEnums">
                    <xsl:with-param name="pDocument" select="text()"/>
                </xsl:call-template>-->
            </xsl:for-each>

        
    </xsl:template>


    <!-- ******************************************************* -->
    <!-- ****** Template which generates the enumerations ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="GenerateEnums">
        <xsl:param name="pTypeName"/>
        <xsl:for-each select="//enums/enum">
            
            <xsl:variable name="vClassname" select="replace(@complexTypeName,'-',' ')"/>
            <xsl:variable name="vClassname" select="functx:words-to-camel-case($vClassname)"/> 
            <xsl:variable name="vClassname" select="concat(upper-case(substring($vClassname,1,1)), substring($vClassname,2))"/>
            
            <xsl:variable name="path" select="replace(@package,'\.','/')"/>
            <xsl:variable name="filename" select="concat('../', $path,'/' , $vClassname,'.java')"/>
            <xsl:value-of select="$filename"/>
            <xsl:result-document href="{$filename}">
                <xsl:text>package </xsl:text><xsl:value-of select="@package"/>; <xsl:text>&#10;</xsl:text>
                <xsl:text>public enum </xsl:text>
                <xsl:call-template name="Pascalize">
                    <xsl:with-param name="pText" select="@complexTypeName"/>
                </xsl:call-template>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>{</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:for-each select="value">
                    <xsl:text>   </xsl:text><xsl:value-of select="text()"/>
                    <xsl:if test="position() != last()">
                        <xsl:text>,</xsl:text>
                        <xsl:text>&#10;</xsl:text>
                    </xsl:if>
                </xsl:for-each>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>}</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>&#10;</xsl:text>
            </xsl:result-document>
        </xsl:for-each>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates pascalize names ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="Pascalize">
        <xsl:param name="pText"/>

        <xsl:if test="$pText">
            <xsl:value-of select="translate(substring($pText,1,1), $vLower, $vUpper)"/>
            <xsl:choose>
                <xsl:when test="contains($pText, '-')">
                    <xsl:value-of select="substring-before(substring($pText,2), '-')"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="substring($pText,2)"/>
                </xsl:otherwise>
            </xsl:choose>
            <xsl:call-template name="Pascalize">
                <xsl:with-param name="pText" select="substring-after(substring($pText,2), '-')"/>
            </xsl:call-template>
        </xsl:if>
    </xsl:template>

    <xsl:function name="functx:words-to-camel-case" as="xs:string" xmlns:functx="http://www.functx.com">
        <xsl:param name="arg" as="xs:string?"/>

        <xsl:sequence select=" 
            string-join((tokenize($arg,'\s+')[1],
            for $word in tokenize($arg,'\s+')[position() > 1]
            return functx:capitalize-first($word))
            ,'')
            "/>

    </xsl:function>


    <xsl:function name="functx:capitalize-first" as="xs:string?" xmlns:functx="http://www.functx.com">
        <xsl:param name="arg" as="xs:string?"/>

        <xsl:sequence select=" 
            concat(upper-case(substring($arg,1,1)),
            substring($arg,2))
            "/>

    </xsl:function>
    

</xsl:stylesheet>
