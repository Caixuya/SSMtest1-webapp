package sqlmap;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	
	@Select("select count(*) from user")//有这句话可以不用UserMapper.xml文件，但是mybatis-config.xml的mappers需要改成<mappers><mapper class="sqlmap.UserMapper"/></mappers>	
	public int count();
}
