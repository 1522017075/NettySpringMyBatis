package httpjar.model.po;

import javax.persistence.Table;

@Table(name = "vd_stu")
public class Student {
	private Integer id;
    private Integer did;
    private String num;
    private String name;
    private String sex;
    private String cls;
    private String cid;
    private String dor;
    private String flag;
    private String buildName;
    private String cover;
    private String phone;
}
