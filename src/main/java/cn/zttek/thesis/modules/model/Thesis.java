package cn.zttek.thesis.modules.model;

import cn.zttek.thesis.modules.enums.DefenseStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

@SuppressWarnings("serial")
public class Thesis extends ProjectModel {

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.topic
     *
     * @mbggenerated
     */
    private String topic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.direction
     *
     * @mbggenerated
     */
    private String direction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.property
     *
     * @mbggenerated
     */
    private String property;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.checked
     *
     * @mbggenerated
     */
    @JsonProperty("check")
    private Boolean checked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.teacherid
     *
     * @mbggenerated
     */
    private Long teacherid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.studentid
     *
     * @mbggenerated
     */
    private Long studentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.viewerid
     *
     * @mbggenerated
     */
    private Long viewerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.uploadtime
     *
     * @mbggenerated
     */
    private Timestamp uploadtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.defensestatus
     *
     * @mbggenerated
     */
    private DefenseStatus defensestatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.profile
     *
     * @mbggenerated
     */
    private String profile;
    /**
     * 添加此字段作为前端显示论文工作标题所用
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * 添加此字段作为前端显示教师名称所用
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String teacher;
    /**
     * 添加此字段作为前端显示学生名称所用
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String student;

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.topic
     *
     * @return the value of thesis.topic
     *
     * @mbggenerated
     */
    public String getTopic() {
        return topic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.topic
     *
     * @param topic the value for thesis.topic
     *
     * @mbggenerated
     */
    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.direction
     *
     * @return the value of thesis.direction
     *
     * @mbggenerated
     */
    public String getDirection() {
        return direction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.direction
     *
     * @param direction the value for thesis.direction
     *
     * @mbggenerated
     */
    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.source
     *
     * @return the value of thesis.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.source
     *
     * @param source the value for thesis.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.property
     *
     * @return the value of thesis.property
     *
     * @mbggenerated
     */
    public String getProperty() {
        return property;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.property
     *
     * @param property the value for thesis.property
     *
     * @mbggenerated
     */
    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.checked
     *
     * @return the value of thesis.checked
     *
     * @mbggenerated
     */
    public Boolean getChecked() {
        return checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.checked
     *
     * @param checked the value for thesis.checked
     *
     * @mbggenerated
     */
    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.teacherid
     *
     * @return the value of thesis.teacherid
     *
     * @mbggenerated
     */
    public Long getTeacherid() {
        return teacherid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.teacherid
     *
     * @param teacherid the value for thesis.teacherid
     *
     * @mbggenerated
     */
    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.studentid
     *
     * @return the value of thesis.studentid
     *
     * @mbggenerated
     */
    public Long getStudentid() {
        return studentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.studentid
     *
     * @param studentid the value for thesis.studentid
     *
     * @mbggenerated
     */
    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.viewerid
     *
     * @return the value of thesis.viewerid
     *
     * @mbggenerated
     */
    public Long getViewerid() {
        return viewerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.viewerid
     *
     * @param viewerid the value for thesis.viewerid
     *
     * @mbggenerated
     */
    public void setViewerid(Long viewerid) {
        this.viewerid = viewerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.uploadtime
     *
     * @return the value of thesis.uploadtime
     *
     * @mbggenerated
     */
    public Timestamp getUploadtime() {
        return uploadtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.uploadtime
     *
     * @param uploadtime the value for thesis.uploadtime
     *
     * @mbggenerated
     */
    public void setUploadtime(Timestamp uploadtime) {
        this.uploadtime = uploadtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.defensestatus
     *
     * @return the value of thesis.defensestatus
     *
     * @mbggenerated
     */
    public DefenseStatus getDefensestatus() {
        return defensestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.defensestatus
     *
     * @param defensestatus the value for thesis.defensestatus
     *
     * @mbggenerated
     */
    public void setDefensestatus(DefenseStatus defensestatus) {
        this.defensestatus = defensestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.profile
     *
     * @return the value of thesis.profile
     *
     * @mbggenerated
     */
    public String getProfile() {
        return profile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.profile
     *
     * @param profile the value for thesis.profile
     *
     * @mbggenerated
     */
    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thesis
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", topic=").append(topic);
        sb.append(", direction=").append(direction);
        sb.append(", source=").append(source);
        sb.append(", property=").append(property);
        sb.append(", checked=").append(checked);
        sb.append(", teacherid=").append(teacherid);
        sb.append(", studentid=").append(studentid);
        sb.append(", viewerid=").append(viewerid);
        sb.append(", uploadtime=").append(uploadtime);
        sb.append(", defensestatus=").append(defensestatus);
        sb.append(", profile=").append(profile);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thesis
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Thesis other = (Thesis) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrgid() == null ? other.getOrgid() == null : this.getOrgid().equals(other.getOrgid()))
            && (this.getProjid() == null ? other.getProjid() == null : this.getProjid().equals(other.getProjid()))
            && (this.getTopic() == null ? other.getTopic() == null : this.getTopic().equals(other.getTopic()))
            && (this.getDirection() == null ? other.getDirection() == null : this.getDirection().equals(other.getDirection()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getProperty() == null ? other.getProperty() == null : this.getProperty().equals(other.getProperty()))
            && (this.getChecked() == null ? other.getChecked() == null : this.getChecked().equals(other.getChecked()))
            && (this.getTeacherid() == null ? other.getTeacherid() == null : this.getTeacherid().equals(other.getTeacherid()))
            && (this.getStudentid() == null ? other.getStudentid() == null : this.getStudentid().equals(other.getStudentid()))
            && (this.getViewerid() == null ? other.getViewerid() == null : this.getViewerid().equals(other.getViewerid()))
            && (this.getUploadtime() == null ? other.getUploadtime() == null : this.getUploadtime().equals(other.getUploadtime()))
            && (this.getDefensestatus() == null ? other.getDefensestatus() == null : this.getDefensestatus().equals(other.getDefensestatus()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()))
            && (this.getCdate() == null ? other.getCdate() == null : this.getCdate().equals(other.getCdate()))
            && (this.getMdate() == null ? other.getMdate() == null : this.getMdate().equals(other.getMdate()))
            && (this.getProfile() == null ? other.getProfile() == null : this.getProfile().equals(other.getProfile()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thesis
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrgid() == null) ? 0 : getOrgid().hashCode());
        result = prime * result + ((getProjid() == null) ? 0 : getProjid().hashCode());
        result = prime * result + ((getTopic() == null) ? 0 : getTopic().hashCode());
        result = prime * result + ((getDirection() == null) ? 0 : getDirection().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getProperty() == null) ? 0 : getProperty().hashCode());
        result = prime * result + ((getChecked() == null) ? 0 : getChecked().hashCode());
        result = prime * result + ((getTeacherid() == null) ? 0 : getTeacherid().hashCode());
        result = prime * result + ((getStudentid() == null) ? 0 : getStudentid().hashCode());
        result = prime * result + ((getViewerid() == null) ? 0 : getViewerid().hashCode());
        result = prime * result + ((getUploadtime() == null) ? 0 : getUploadtime().hashCode());
        result = prime * result + ((getDefensestatus() == null) ? 0 : getDefensestatus().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        result = prime * result + ((getCdate() == null) ? 0 : getCdate().hashCode());
        result = prime * result + ((getMdate() == null) ? 0 : getMdate().hashCode());
        result = prime * result + ((getProfile() == null) ? 0 : getProfile().hashCode());
        return result;
    }
}