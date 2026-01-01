/*
package Ecom.ServiceImpl;

import Ecom.Enum.UserRole;
import Ecom.Exception.UserException;
import Ecom.Model.User;
import Ecom.ModelDTO.CustomerDTO;
import Ecom.Repository.UserRepository;
import Ecom.Service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static Ecom.Enum.UserRole.ROLE_USER;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private UserServiceImpl userService;

    private CustomerDTO customerDTO;

    private User user;
    private User user1;

    @BeforeEach
    void setUp() {

        // MockitoAnnotations.openMocks(this);
        // sample DTO for customer.
        customerDTO = new CustomerDTO();
        customerDTO = new CustomerDTO();
        customerDTO.setEmail("vishal@gmail.com");
        customerDTO.setPassword("Vishal123");
        customerDTO.setFirstName("vishal");
        customerDTO.setLastName("giri");
        customerDTO.setPhoneNumber("9293993993");


        // sample dto for user
        user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("user123");
        user.setFirstName("user");
        user.setLastName("user");
        user.setUserId(2002);
        user.setRole(ROLE_USER);

        user1 = new User();
        user1.setUserId(2003);
        user1.setEmail("user1@gmail.com");
        user1.setFirstName("user1");
        user1.setLastName("user1");
        user1.setPassword("user123");
        user1.setRole(ROLE_USER);

    }

    @Test
    void testAddUserAdmin(){

    }

    @Test
    void testGetAllUserDetails() throws UserException{
        // arrange.
        List<User> userList = Arrays.asList(user,user1);
        when(userRepository.findAll()).thenReturn(userList);

        // act ( call the method)
        List<User> allUserDetails = userService.getAllUserDetails();

        // assert
        assertEquals(2002, allUserDetails.get(0).getUserId());

    }


    @Test
    void getUserDetails_ShouldReturnUser_WhenUserExist() throws UserException {

        // arrange.
        when(userRepository.findById(user.getUserId()))
                .thenReturn(Optional.of(user));
        // act
        User returnedUser = userService.getUserDetails(user.getUserId());

        //assert
        assertNotNull(returnedUser);
        assertEquals("user@gmail.com", returnedUser.getEmail());
        assertEquals(2002, returnedUser.getUserId());

    }


    @Test
    void addUser_ShouldSaveNewUser_WhenEmailNotExists() throws UserException {

        // Arrange.
        when(userRepository.findByEmail(customerDTO.getEmail()))
                .thenReturn(Optional.empty());
        when(userRepository.save(any(User.class)))
                .thenAnswer(invocation -> invocation.getArgument(0));
        // Act.
        User savedUser = userService.addUser(customerDTO);
        // Assert.
        assertEquals("vishal@gmail.com", savedUser.getEmail());


    }

    @Test
    void addUser_ShouldThrowException_WhenCustomerIsNull() {
        // act. & assert
        UserException exception =
                assertThrows(UserException.class,
                        () -> userService.addUser(null));

        assertEquals("customer Can not be Null", exception.getMessage());

    }

    @Test
    void addUser_ShouldThrowRuntimeException_WhenUserIsExist() {
        CustomerDTO customer = new CustomerDTO();
        customerDTO.setEmail("vishal@gmail.com");

        // arrange.
        when(userRepository.findByEmail(customer.getEmail()))
                .thenReturn(Optional.of(new User()));

        // act and assert.
        RuntimeException runtimeException =
                assertThrows(RuntimeException.class, () -> userService.addUser(customer));

        assertEquals("Email already Register", runtimeException.getMessage());

    }



}*/
