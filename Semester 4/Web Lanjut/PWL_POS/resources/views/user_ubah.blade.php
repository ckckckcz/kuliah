<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Tambah Data User</title>
</head>

<body>
    <h1>Form Ubah Data User</h1>
    <a href="/user">Kembali</a>
    <br>

    <form method="POST" action="/user/ubah_simpan/{{ $user->user_id }}">
        {{ csrf_field() }}
        {{ method_field('PUT') }}

        <label>Username</label>
        <input type="text" name="username" placeholder="Masukkan Username" value="{{ $user->username }}">
        <br>

        <label>Nama</label>
        <input type="text" name="nama" placeholder="Masukkan Nama" value="{{ $user->nama }}">
        <br>

        <label>Password</label>
        <input type="password" name="password" placeholder="Masukkan Password" value="{{ $user->password }}">
        <br>

        <label>Level ID</label>
        <input type="number" name="level_id" placeholder="Masukkan ID Level" value="{{ $user->level_id }}">
        <br><br>

        <input type="submit" class="btn btn-success" value="Ubah">
    </form>
</body>

</html>