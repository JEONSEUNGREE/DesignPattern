package adapter;

// Adapter 다목적으로 사용하기 위한 것
// double을 받아서 float 형태로 반환하기
public interface Adapter {

//    원하는 기능
    public Float twiceOf(Float f);
//    원하는 기능
    public Float halfOf(Float f);
}
