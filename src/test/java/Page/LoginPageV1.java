package Page;

import Data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageV1 {

    public void validAuthorization(){
        $("[data-test-id=login] input").setValue(DataHelper.getAuthInfo().getLogin());
        $("[data-test-id=password]").setValue(DataHelper.getAuthInfo().getPassword());
        $("[]")
    }
}
