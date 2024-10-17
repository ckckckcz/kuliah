document.getElementById("generateForm").addEventListener("click", function () {
  let jumlahField = document.getElementById("jumlahField").value;
  if (jumlahField > 0) {
    const xhr = new XMLHttpRequest();
    xhr.open("POST", "generate_form.php", true);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xhr.onreadystatechange = function () {
      if (xhr.readyState === 4 && xhr.status === 200) {
        document.getElementById("dynamicFormContainer").innerHTML = xhr.responseText;
      }
    };
    xhr.send("jumlahField=" + jumlahField);
  }
});
