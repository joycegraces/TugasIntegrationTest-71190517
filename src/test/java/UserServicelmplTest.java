import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserServicelmplTest {

    //Dummy class
    User user = Mockito.mock(User.class);

    //Mock Object
    SecurityService securityService = Mockito.mock(SecurityService.class);
    UserDAO userDaO = Mockito.mock(UserDAO.class);

    @Test

    public void tesAsPass() throws Exception {
        UserServiceImpl sut = new UserServiceImpl(userDaO, securityService);
        //Cek apakah sudah mendapatkan password baru
        sut.assignPassword(user);
        verify(user).getPassword();
    }
    @Test
    public void tesmethod() throws Exception{
        //Mengecek apakah method update user sudah dipanggil dengan benar oleh userDao
        UserServiceImpl sut2 = new UserServiceImpl(userDaO, securityService);
        sut2.assignPassword(user);
        verify(userDaO).updateUser(user);

        //Jawaban Kedua
        //userDaO.updateUser(user);
        //verify(userDaO).updateUser(user);

        
    }
}