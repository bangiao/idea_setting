#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#if (${IMPORT_BLOCK} != "")${IMPORT_BLOCK}
#end
/**
 * @author zhazha
 * @date ${DATE} ${TIME}
 * @version 1.0.0
 * @msg
 **/
public interface ${NAME} #if (${INTERFACES} != "")extends ${INTERFACES} #end {
}
