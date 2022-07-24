var items = document.getElementsByClassName('sub-nav-parent');
for (let item of items) {
    item.addEventListener('click', el => {
        console.log(el.currentTarget.children[1]);
        el.currentTarget.children[1].classList.toggle('close');
    })
}
