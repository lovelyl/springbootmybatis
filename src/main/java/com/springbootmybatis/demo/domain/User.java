package com.springbootmybatis.demo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Create liyuanlin
 * @date 2016/8/16
 */

@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 2635368538698963071L;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "email")
    private String Email;

    @Column(name = "telphone")
    private Integer TelphoneNum;

    @Column(name = "create_date")
    private Date CreateDate;

    @Column(name = "last_changed")
    private Date LastChanged;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getTelphoneNum() {
        return TelphoneNum;
    }

    public void setTelphoneNum(Integer telphoneNum) {
        TelphoneNum = telphoneNum;
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public Date getLastChanged() {
        return LastChanged;
    }

    public void setLastChanged(Date lastChanged) {
        LastChanged = lastChanged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (Id != null ? !Id.equals(user.Id) : user.Id != null) return false;
        if (Name != null ? !Name.equals(user.Name) : user.Name != null) return false;
        if (Email != null ? !Email.equals(user.Email) : user.Email != null) return false;
        if (TelphoneNum != null ? !TelphoneNum.equals(user.TelphoneNum) : user.TelphoneNum != null) return false;
        if (CreateDate != null ? !CreateDate.equals(user.CreateDate) : user.CreateDate != null) return false;
        return LastChanged != null ? LastChanged.equals(user.LastChanged) : user.LastChanged == null;

    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (Name != null ? Name.hashCode() : 0);
        result = 31 * result + (Email != null ? Email.hashCode() : 0);
        result = 31 * result + (TelphoneNum != null ? TelphoneNum.hashCode() : 0);
        result = 31 * result + (CreateDate != null ? CreateDate.hashCode() : 0);
        result = 31 * result + (LastChanged != null ? LastChanged.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", TelphoneNum=" + TelphoneNum +
                ", CreateDate=" + CreateDate +
                ", LastChanged=" + LastChanged +
                '}';
    }
}
