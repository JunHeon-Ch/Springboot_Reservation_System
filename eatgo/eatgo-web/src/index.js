(async () => {
    const url = 'http://localhost:3030/restaurants';
    const response = await fetch(url);
    const restaurants = await response.json();
    console.log(data);

    const element = document.getElementById('app');
    element.innerHTML = `
        ${restaurants.map(restaurant =>`
            <p>
                ${restaurant.id}
                ${restaurant.name}
                ${restaurant.address}
            </p>
        `).join('')}
    `;
})