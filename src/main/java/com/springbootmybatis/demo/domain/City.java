package com.springbootmybatis.demo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Create liyuanlin
 * @date 2016/8/16
 */
@Entity
@Table(name = "city")
public class City implements Serializable{

    private static final long serialVersionUID = 8474318633822043988L;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "name")
    private String  Name;

    @Column(name = "country")
    private String  Country;

    @Column(name = "area")
    private String Area;

    @Column(name = "area_num")
    private String AreaNum;

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

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getAreaNum() {
        return AreaNum;
    }

    public void setAreaNum(String areaNum) {
        AreaNum = areaNum;
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

        City city = (City) o;

        if (Id != null ? !Id.equals(city.Id) : city.Id != null) return false;
        if (Name != null ? !Name.equals(city.Name) : city.Name != null) return false;
        if (Country != null ? !Country.equals(city.Country) : city.Country != null) return false;
        if (Area != null ? !Area.equals(city.Area) : city.Area != null) return false;
        if (AreaNum != null ? !AreaNum.equals(city.AreaNum) : city.AreaNum != null) return false;
        if (CreateDate != null ? !CreateDate.equals(city.CreateDate) : city.CreateDate != null) return false;
        return LastChanged != null ? LastChanged.equals(city.LastChanged) : city.LastChanged == null;

    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (Name != null ? Name.hashCode() : 0);
        result = 31 * result + (Country != null ? Country.hashCode() : 0);
        result = 31 * result + (Area != null ? Area.hashCode() : 0);
        result = 31 * result + (AreaNum != null ? AreaNum.hashCode() : 0);
        result = 31 * result + (CreateDate != null ? CreateDate.hashCode() : 0);
        result = 31 * result + (LastChanged != null ? LastChanged.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Country='" + Country + '\'' +
                ", Area='" + Area + '\'' +
                ", AreaNum='" + AreaNum + '\'' +
                ", CreateDate=" + CreateDate +
                ", LastChanged=" + LastChanged +
                '}';
    }
}
