package tobi_Spring.Chapter001_Ex007_DataSource_xml;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Wrapper;
import javax.sql.CommonDataSource;

public interface DataSource extends CommonDataSource,Wrapper{

	Connection getConnection() throws SQLException;
}
