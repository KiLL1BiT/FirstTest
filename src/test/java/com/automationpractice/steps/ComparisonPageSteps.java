package com.automationpractice.steps;

        import com.automationpractice.pages.ComparisonPage;
        import net.thucydides.core.annotations.Step;
        import net.thucydides.core.steps.ScenarioSteps;

public class ComparisonPageSteps extends ScenarioSteps {

    ComparisonPage onPage;

    @Step
    public void comparisonBlock1Visible() {
        onPage.comparisonBlock1Visible();
    }

    @Step
    public void comparisonBlock2Visible() {
        onPage.comparisonBlock2Visible();
    }

    @Step
    public void deleteProduct1() {
        onPage.deleteProduct1();
    }

    @Step
    public void deleteProduct2() {
        onPage.deleteProduct2();
    }

    @Step
    public void comparisonBlock1Invisible() {
        onPage.comparisonBlock1Invisible();
    }

    @Step
    public void comparisonBlock2Invisible() {
        onPage.comparisonBlock2Invisible();
    }

}
