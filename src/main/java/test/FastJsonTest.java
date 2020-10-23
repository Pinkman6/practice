package test;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class FastJsonTest {
    public static void main(String[] args) {
        Dog joe = new Dog("joe", 1);
        String s = JSON.toJSONString(joe);
        System.out.println(s);

        String manString = "{'name':'liZ','age':15,'dog':{'name':'gaga','sex':2},'car':{'color':'red','brand':'BMW'}}";
        Man man = JSON.parseObject(manString, Man.class);
        String s1 = JSON.toJSONString(man);
        System.out.println(s1);
        System.out.println(man);

        Gson gson = new Gson();
        Man man1 = gson.fromJson(manString, Man.class);
        System.out.println("man1 = " + man1);

    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Man{
    String name;
    Integer age;
    Dog dog;
}
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Dog{
    String name;
    Integer sex;
}