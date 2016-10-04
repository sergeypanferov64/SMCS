package ru.spanferov.learning.smcs.rent;

public class FeeDTO {

    private Integer fee;

    public FeeDTO() {
    }

    public FeeDTO(Integer fee) {
        this.fee = fee;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }
}
