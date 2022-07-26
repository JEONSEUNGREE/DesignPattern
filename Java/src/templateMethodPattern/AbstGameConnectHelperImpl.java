package templateMethodPattern;

public class AbstGameConnectHelperImpl extends AbstGameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("디코딩");
        return "디코딩";
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("인증");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        return "접속확인";
    }
}
