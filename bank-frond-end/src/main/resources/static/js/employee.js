// toast, modal, animation ...
const Toast = Swal.mixin({
    toast: true,
    position: 'top-end',
    showConfirmButton: false,
    timer: 3000,
    timerProgressBar: true,
    didOpen: (toast) => {
        toast.addEventListener('mouseenter', Swal.stopTimer);
        toast.addEventListener('mouseleave', Swal.resumeTimer);
    }
});

// DOM
const txtEnpty = $('#txtEmpty');
const tblSearch = $('#tblSearch');

txtEnpty.hide();

// function
const searchEmployee = (form) => {
    txtEnpty.hide();
    tblSearch.show();
    if (form.keyword.value === '') {
        Toast.fire({
            icon: 'error',
            title: 'Bạn chưa nhập tên nhân viên'
        });
        form.keyword.focus();
    } else {
        if (form.keyword.value === '1') {
            tblSearch.hide();
            txtEnpty.show();
        }
    }
}

const deleteEmployee = (form) => {
    Swal.fire({
        title: 'Bạn có chắc muốn xoá không?',
        text: "Bạn sẽ không thể lấy lại!",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Có, hãy xoá nó!'
    }).then((result) => {
        if (result.isConfirmed) {
            form.submit();
        }
    });
}