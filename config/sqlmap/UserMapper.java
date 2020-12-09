package sqlmap;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	
	@Select("select count(*) from user")
	public int count();

}
