package templateMethodPattern;

public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id,String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    //    템플릿 메서드
    public String requestConnection(String encodedInfo) {

        // 보안 작업 -> 암호화 된 문자열 복호
        String decodedInfo = doSecurity(encodedInfo);

        // 위에서 디코딩되었다는 조건하에
        // 반환된 것을 가지고 아이디, 암호를 할당한다.
        String id = "aaa";
        String password = "bbb";

        if (!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }

        String userName = "userName";

        int i = authorization(userName);

        switch (i) {
            case 0:
                System.out.println("게임 매니저");
                break;
            case 1:
                System.out.println("유료 회");
                break;
            case 2:
                System.out.println("무료 회원");
                break;
            case 3:
                System.out.println("휴면 계정");
                break;
            default:
                System.out.println("기타 사항");
        }

        return connection(decodedInfo);
    }
}
