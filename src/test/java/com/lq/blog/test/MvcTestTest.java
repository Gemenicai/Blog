package com.lq.blog.test;

import com.github.pagehelper.PageInfo;
import com.lq.blog.po.Type;
import junit.runner.BaseTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author:liuqun
 * @Date:2019/10/11
 * @Description:com.lq.blog.test
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
public class MvcTestTest{
    /*传入SpringMvc的ioc*/
    @Autowired
    WebApplicationContext context;
    /*虚拟mvc请求，获取到处理结果*/
    MockMvc mockMvc;

    @Before
    public void initMockMvc(){
        mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testPage() throws Exception {
        //模拟请求拿到返回值
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("types").param("pn", "1")).andReturn();
        System.out.println(result);
        //请求成功以后，请求域中会有pageInfo；取出pageInfo进行验证
        MockHttpServletRequest request = result.getRequest();
        System.out.println(request);
        PageInfo attribute = (PageInfo) request.getAttribute("pageInfo");
        System.out.println("当前页码："+attribute.getPageNum());
        System.out.println("总页码："+attribute.getTotal());
        System.out.println("在页面需要连续显示的页码：");
        int[] nums = attribute.getNavigatepageNums();
        for (int i:nums){
            System.out.println(""+i);
        }
        //获取type里的数据
        List<Type> list = attribute.getList();

        for (Type type:list){
            System.out.println("ID:"+type.getId()+"==>Type"+type.getName());
        }
    }
}