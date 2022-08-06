package ObserverPattern;

public class Button {

    public void onClick() {
//      이벤트 처리
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

//    대부분의 옵저버 패턴은 내부에서 정의됨
    public interface OnClickListener {
        public void onClick(Button button);
    }

    private OnClickListener onClickListener;

    public void setClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

}
