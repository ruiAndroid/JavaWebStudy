package model;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OkHttpClient okHttpClient=context.getBean("okHttpClient", OkHttpClient.class);
        Request request = new Request.Builder()
                .url("www.baidu.com")
                .build();
        Response response = okHttpClient.newCall(request).execute();

        System.out.print(response.body().string());

    }

}
