package ioc;

import java.util.Properties;

public class SqlSessionFactorCreator {

    private Properties prop;
   public SqlSessionFactory create(){
      return   new SqlSessionFactory(prop);
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "SqlSessionFactorCreator{" +
                "prop=" + prop +
                '}';
    }
}
