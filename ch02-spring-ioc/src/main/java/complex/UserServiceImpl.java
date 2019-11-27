package complex;

/**
 * @author cj
 * @date 2019/10/17
 */
public class UserServiceImpl implements UserService
{
    private UserDao dao ;


    private String xxx;

    public void setXxx(String xxx) {
        this.xxx = xxx;
    }

//    public UserServiceImpl(UserDaoImpl dao) {
//        this.dao = dao;
//    }
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void update(){
        dao.update();
    }
}
