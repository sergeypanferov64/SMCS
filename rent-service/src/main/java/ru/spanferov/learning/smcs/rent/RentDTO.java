package ru.spanferov.learning.smcs.rent;

public class RentDTO {

    private Integer count;
    private Integer fee;

    public RentDTO() {
    }

    public RentDTO(Integer count, Integer fee) {
        this.count = count;
        this.fee = fee;
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
}
