package ksh.dockerpratice.cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class HealthStepDefinitions {

    @Autowired
    private MockMvc mockMvc;

    private MvcResult result;

    @When("클라이언트가 GET \\/health API를 요청하면")
    public void 클라이언트가_GET_health_API를_요청하면() throws Exception {
        result = mockMvc.perform(get("/health")).andReturn();
    }

    @Then("응답 상태 코드는 {int} 이어야 한다")
    public void 응답_상태_코드는_이어야_한다(int statusCode) {
        assertThat(result.getResponse().getStatus()).isEqualTo(statusCode);
    }

    @Then("응답 본문은 {string} 이어야 한다")
    public void 응답_본문은_이어야_한다(String expectedBody) throws Exception {
        assertThat(result.getResponse().getContentAsString()).isEqualTo(expectedBody);
    }
}