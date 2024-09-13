// card.js
import contentData from "../data/contentData.js";

const cardsContainer = document.querySelector(".cardsBox");

contentData.forEach((item) => {
  const card = document.createElement("div");
  card.classList.add("box");

  card.innerHTML = `
    <div class="box-icon">
      ${item.icon}
    </div>
    <div class="box-label">${item.label}</div>
    <div class="box-title">${item.title} <span style="color:white">Web</span></div>
    <div class="box-image">
      <img src="${item.image}" alt="Card Image" />
    </div>
    <div class="studio-button">
      <div class="studio-button-icon">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" width="20" height="20">
          <path fill="#fff" d="M9.4 233.4c-12.5 12.5-12.5 32.8 0 45.3l160 160c12.5 12.5 32.8 12.5 45.3 0s12.5-32.8 0-45.3L109.2 288 416 288c17.7 0 32-14.3 32-32s-14.3-32-32-32l-306.7 0L214.6 118.6c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0l-160 160z"/>
        </svg>
      </div>
      <div class="studio-button-label">Open in Studio</div>
    </div>
  `;

  cardsContainer.appendChild(card);
});
