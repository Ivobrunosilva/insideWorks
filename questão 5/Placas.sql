SELECT v.placa, v.estado_cidade
FROM Veiculo v
JOIN Propriedade p ON v.placa = p.placa
JOIN Proprietario pr ON p.id_proprietario = pr.id_proprietario
WHERE pr.nome = 'Joaquim Silva';
