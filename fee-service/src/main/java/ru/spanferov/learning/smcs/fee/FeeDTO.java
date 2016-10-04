package ru.spanferov.learning.smcs.fee;

public class FeeDTO {

    private Integer fee;

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
