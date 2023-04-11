let modal_pop = document.querySelector(".modal-pop");
let total_layer = document.querySelector(".total-layer");
let modal_inner = document.querySelectorAll(".modal-inner");
let select_btn = document.querySelectorAll(".select");
let thanks_card = document.getElementById("thanks-card");
let type = document.getElementById("type");
let boxs = document.getElementsByName("pledge");
let input_pledge = document.querySelectorAll(".input-pledge");
let subMenuBtn = document.getElementById("subMenu");
let subMenu = document.querySelector(".subMenu");
let sub_menu_icon = document.getElementById("subMenuIcon");
let isMenuOpen = false;
let bookmark = document.getElementById("bookmark");
let bookmark_text = document.querySelector(".bookmark");

// DISPLAY SUBMENU

subMenuBtn.addEventListener("click", () => {
  isMenuOpen = !isMenuOpen;
  if (isMenuOpen) {
    subMenu.style.display = "block";
    total_layer.classList.add("show");
    sub_menu_icon.src = "./assets/icons/icon-close-menu.svg";
  } else {
    subMenu.style.display = "none";
    total_layer.classList.remove("show");
    sub_menu_icon.src = "./assets/icons/icon-hamburger.svg";
  }
});


let bookmarked = false;

bookmark.addEventListener("click", () => {
  bookmarked = !bookmarked;
  bookmarked
    ? (bookmark_text.innerText = "Bookmarked")
    : (bookmark_text.innerText = "Bookmark");
});