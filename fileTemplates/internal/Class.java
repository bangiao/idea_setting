#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#if (${IMPORT_BLOCK} != "")${IMPORT_BLOCK}
#end
/**
 * @author zhazha
 * @date ${DATE} ${TIME}
 * @version 1.0.0
 * @msg
 **/
public #if (${ABSTRACT} == "TRUE")abstract #end #if (${FINAL} == "TRUE")final #end class ${NAME} #if (${SUPERCLASS} != "")extends ${SUPERCLASS} #end #if (${INTERFACES} != "")implements ${INTERFACES} #end {
}
