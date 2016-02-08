import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {


  @Test
  public void pingPong_forDivisibleBy15_replaceWithPingPong() {
    PingPong pingPong = new PingPong();
    assertEquals(new ArrayList<>(Arrays.asList("1", "2", "Ping","4","Pong","Ping","7", "8", "Ping", "Pong","11","Ping","13","14","PingPong")), pingPong.pingPong(15));
  }
  @Test
  public void pingPong_forANumber_listUpToThatNumber() {
    PingPong pingPong = new PingPong();
    assertEquals(new ArrayList<>(Arrays.asList("1", "2")), pingPong.pingPong(2));
  }
  @Test
  public void pingPong_forDivisibleBy3_replaceWithPing() {
    PingPong pingPong = new PingPong();
    assertEquals(new ArrayList<>(Arrays.asList("1", "2", "Ping")), pingPong.pingPong(3));
  }
  @Test
  public void pingPong_forDivisibleBy5_replaceWithPong() {
    PingPong pingPong = new PingPong();
    assertEquals(new ArrayList<>(Arrays.asList("1", "2", "Ping","4","Pong")), pingPong.pingPong(5));
  }
}


// @Test
// public void pingPong_forDivisibleBy15_replaceWithPingPong() {
//   PingPong pingPong = new PingPong();
//   assertEquals(new ArrayList<>(Arrays.asList("1", "2", "Ping","4","Pong","Ping",7,8,"Ping","Pong",11,"Ping",13,14,"PingPong")), pingPong.pingPong(15));
