package cn.echo.jihe;

import java.util.Date;

/**
 * @ClassName : Message
 * @Author : Jiangnan
 * @Date: 2020/10/26 10:36
 * @Description : 留言类
 **/
public class Message {

    private int id;
    private String name;
    private String content;
    private Date date;

    public Message() {
    }

    public Message(int id, String name, String content, Date date) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
