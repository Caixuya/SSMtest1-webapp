package sqlmap;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	
	//有这句话可以不用UserMapper.xml文件，但是mybatis-config.xml的mappers需要改成<mappers><mapper class="sqlmap.UserMapper"/></mappers>	
	@Select("select count(*) from user")
	public int count();

/*如果必须有UserMapper.xml文件，则不用写@Select文件，需要另外创一个UserMapper.xml文件，然后写代码如下：（具体参考SSMtest3-webapp）
  <mapper namespace="com.thxy.dao.user.UserMapper">
	<select id="count" parameterType="int"
		resultType="int">
		select count(id) from t_user
	</select>
</mapper>*/
	
}