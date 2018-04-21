var Application = (function (Application) {

    $(document).on("click", ".login__button", function () {
        var username = $("#account-username").val();
        var password = $("#account-password").val();
        $.ajax({
            url: "login.html",
            type: "GET",
            headers: {
                "Authorization": "Basic " + btoa(username + ":" + password)
            },
            success: function (response, status) {
                $(".user__img").addClass("d-none");
                console.log(response);
                var logoutButoon = $("<a>").addClass("btn btn-outline-danger")
                    .attr("href", "logout.html").html("Logout")

                $(".user__img").remove();
                $(".user-collapse").remove();
                $(".loginSearch__container").append(logoutButoon);
            },
            error: function (error) {
                console.log("ERROR");
            }

        })
    })

}(Application || {}))