let modeSwitch = document.querySelector('.mode-switch');
modeSwitch.addEventListener('click', function () {
  document.documentElement.classList.toggle('dark');
 modeSwitch.classList.toggle('active');
});

document.addEventListener('DOMContentLoaded', function() {
    const btnBar = document.querySelector('.btn-bar');
    const sidebar = document.querySelector('.sidebar');
    const dropdownButtons = document.querySelectorAll('.show-dropdown');

    btnBar.addEventListener('click', function() {
      sidebar.classList.toggle('appear');
    });


    dropdownButtons.forEach(button => {
        button.addEventListener('click', function() {
            const dropdownContent = this.nextElementSibling;
            dropdownContent.classList.toggle('show');
        });
    });
  });