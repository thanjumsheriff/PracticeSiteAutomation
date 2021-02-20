package com.cg.stepdef;

import java.util.Map;

import com.cg.page.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	Pages slider;

	@Given("User opens the browser and go to webpage")
	public void user_opens_the_browser_and_go_to_webpage() {
		slider = new Pages();
	}

	@When("User click shop menu")
	public void user_click_shop_menu() {
		slider.clickShop();
	}

	@When("user click on Home menu")
	public void user_click_on_Home_menu() {
		slider.clickHome();
	}

	@When("test home page has three slides only")
	public void test_home_page_has_three_slides_only() {
		slider.checkSlider();
	}

	@Then("check its only have three slides")
	public void check_its_only_have_three_slides() {
		slider.confirmSlider();
	}

	@When("user clicks image in the arrival")
	public void user_clicks_image_in_the_arrival() {
		slider.clickOnImage();
	}

	@When("check whether it is navigating to next page")
	public void check_whether_it_is_navigating_to_next_page() {
		slider.checkingNavigation();
	}

	@When("add that book into basket")
	public void add_that_book_into_basket() {
		slider.addToBasket();
	}

	@Then("check the user can add to basket")
	public void check_the_user_can_add_to_basket() {
		slider.checkingBasket();
	}

	@When("test home page has three arrivals only")
	public void test_home_page_has_three_arrivals_only() {
		slider.checkArrival();
	}

	@Then("check its only have three arrivals")
	public void check_its_only_have_three_arrivals() {
		slider.confirm();
	}

	@When("user clicks book Review")
	public void user_clicks_book_Review() {
		slider.clickingReview();
	}

	@When("adds review for book")
	public void adds_review_for_book(io.cucumber.datatable.DataTable dataTable) {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
		slider.addReview(map.get("reviews"), map.get("name"), map.get("email"));
	}

	@When("user clicks Submit")
	public void user_clicks_Submit() {
		slider.submitReview();
	}

	@Then("check the user can see review")
	public void check_the_user_can_see_review() {
		slider.viewReview();
	}

	@When("user clicks book description")
	public void user_clicks_book_description() {
		slider.clickingDescription();
	}

	@Then("check the user can see description")
	public void check_the_user_can_see_description() {
		slider.checkingDescription();
	}

}
