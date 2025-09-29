<?php

$url = "http://localhost:8080/pet/list";
$data = file_get_contents($url);

//Json to array

$pets = json_decode($url, true);


var_dump($pets);


?>


<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
    <body>
        <table class="table table-striped">
            <thead>
                <tr>
                    <td>ID</td>
                    <td>NAME</td>
                    <td>CHIP</td>
                    <td>BORN</td>
                    <td>CATEGORY</td>
                </tr>
            </thead>
            <tbody>
                <?php if(!empty($pets)): ?>
                    <?php foreach($pets as $pet): ?>
                        <tr>
                            <td><?php echo $pet['id']; ?></td>
                            <td><?php echo $pet['name']; ?></td>
                            <td><?php echo $pet['chip']; ?></td>
                            <td><?php echo $pet['born']; ?></td>
                            <td><?php echo $pet['category_id']; ?></td>
                        </tr>
                    <?php endforeach; ?>
                <?php endif; ?>
            </tbody>
        </table>
    </body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</html>