package ru.spanferov.learning.smcs.fink;

public class FinkDTO {

    private String ip;
    private Integer count;
    private Integer fee;

    public FinkDTO() {
    }

    public FinkDTO(String ip, Integer count, Integer fee) {
        this.ip = ip;
        this.count = count;
        this.fee = fee;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "FinkDTO{" +
                "ip='" + ip + '\'' +
                ", count=" + count +
                ", fee=" + fee +
                '}';
    }
}
