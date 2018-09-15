package com.wolf.cloud.user;

import com.wolf.cloud.api.entities.User;
import com.wolf.cloud.user.mapper.UserMapper;
import com.wolf.cloud.user.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Captain Wolf
 * 2018/9/9 17:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {
  @Autowired
  UserService userService;
  @Autowired
  UserMapper userMapper;
  @Autowired
  private DiscoveryClient client;

  @Test
  public void findUser() {
    User user = userMapper.selectById(2);
    System.out.println(user);
  }

  @Test
  public void getUser() {
    User user = userService.get(2);
    System.out.println(user);
  }

  @Test
  public void discoveryTest() {
    List<String> list = client.getServices();
    System.out.println("**********" + list);

    List<ServiceInstance> srvList = client.getInstances("WOLFCLOUD-USER");
    for (ServiceInstance element : srvList) {
      System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
        + element.getUri());
    }
    System.out.println(client);
  }

}
