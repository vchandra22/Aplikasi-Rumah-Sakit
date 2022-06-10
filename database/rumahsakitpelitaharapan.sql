-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2022 at 04:03 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rumahsakitpelitaharapan`
--

-- --------------------------------------------------------

--
-- Table structure for table `diagnosa`
--

CREATE TABLE `diagnosa` (
  `no_diagnosa` int(11) NOT NULL,
  `hasil_periksa` varchar(255) NOT NULL,
  `id_dokter` int(9) NOT NULL,
  `id_pasien` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `diagnosa`
--

INSERT INTO `diagnosa` (`no_diagnosa`, `hasil_periksa`, `id_dokter`, `id_pasien`) VALUES
(33500001, 'Asma', 808802, 9880001),
(33500002, 'Alergi Imunologi', 808810, 9880002),
(33500003, 'Hemofilia', 808805, 9880003),
(33500004, 'Jantung Koroner', 808810, 9880004),
(33500005, 'Anemia', 808805, 9880005),
(33500006, 'Diabetes', 808805, 9880006),
(33500007, 'Demam Berdarah', 808805, 9880007),
(33500008, 'Asma', 808808, 9880009),
(33500009, 'Tuberkulosis', 808802, 9880010),
(33500010, 'Laringitis', 808802, 9880011),
(33500011, 'Bronkhitis', 808809, 9880012),
(33500012, 'Laringitis', 808808, 9880013),
(33500013, 'Emifesema', 808809, 9880014),
(33500014, 'Asma', 808808, 9880015),
(33500015, 'Demam Berdarah', 808810, 9880016),
(33500016, 'Alergi Imunologi', 808810, 9880017),
(33500017, 'Paru Paru Basah', 808802, 9880018),
(33500018, 'Emifisema', 808811, 9880019),
(33500023, 'Asma', 808802, 9880020),
(33500024, 'Asma', 808802, 9880021),
(33500025, 'TBC', 808802, 9880032),
(33500027, 'Asma', 808804, 9880021),
(33500028, 'Batuk', 808800, 9880025),
(33500029, 'Radang saluran pernafasan', 808808, 9880035),
(33500030, 'Asam Lambung', 808808, 9880036),
(33500031, 'Asma', 808808, 9880037);

--
-- Triggers `diagnosa`
--
DELIMITER $$
CREATE TRIGGER `auto_resep` AFTER INSERT ON `diagnosa` FOR EACH ROW BEGIN
INSERT INTO resep (tgl_resep, id_pasien, no_obat)
VALUES (curdate(), new.id_pasien, '898800001');
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `id_dokter` int(9) NOT NULL,
  `nama_dokter` varchar(49) NOT NULL,
  `spesialis` varchar(49) NOT NULL,
  `biaya_periksa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`id_dokter`, `nama_dokter`, `spesialis`, `biaya_periksa`) VALUES
(808800, '-', '-', 0),
(808801, 'dr. Cantika Trikharena Sp.A', 'Anak', 145000),
(808802, 'dr. Budi Mulyono Sp.P', 'Paru Paru', 250000),
(808803, 'dr. Eva Tri Kurnia Sp.A', 'Anak', 120000),
(808804, 'dr. Zaenal Abidin Sp.JP', 'Jantung dan Pembuluh Darah', 350000),
(808805, 'dr. Irfan Budiono Sp.PD', 'Penyakit Dalam', 165000),
(808806, 'dr. Nugroho Sp.PM', 'Penyakit Mulut', 275000),
(808807, 'dr. Feby Veronika Sp.BP', 'Bedah Plastik', 480000),
(808808, 'dr. Nanda Suherman Sp.P', 'Paru Paru', 239000),
(808809, 'dr. Siska Dian Sp.P', 'Paru Paru', 240000),
(808810, 'dr. Cahya Nugraha Sp. PD', 'Penyakit Dalam', 200000),
(808811, 'dr. Arif Setiabudi Sp. JP', 'Jantung dan Pembuluh Darah', 250000),
(808812, 'dr. Hermawan Sp. P', 'Paru Paru', 95000),
(808813, 'dr. Sukiman Sp. P', 'Paru Paru', 120000);

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `no_obat` int(11) NOT NULL,
  `nama_obat` varchar(49) NOT NULL,
  `jenis_obat` varchar(49) NOT NULL,
  `dosis` varchar(49) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`no_obat`, `nama_obat`, `jenis_obat`, `dosis`, `harga`) VALUES
(898800001, '-', '-', '-', 0),
(898800002, 'Lasal Expectorant Sirup 100 ml', 'Sirup', ' 2-3 x sehari 1-2 sendok takar 5 mL', 200000),
(898800003, 'Bronchitin Sirup 60 ml', 'Sirup', ' 2-3 x sehari 1-2 sendok takar 5 mL', 10000),
(898800004, 'Paracetamol 100 mg', 'Kapsul', '2-3 kapsul sehari (sesudah makan)', 25000),
(898800005, 'Ipratropium Bromida', 'Semprot', '0.02 mg/dosis', 300000),
(898800006, 'Dextrometrophan HBr', 'Kapsul', '2-3 kali sehari (sesudah makan)', 29000),
(898800007, 'Dextrometrophan HBr 10 mg', 'Kapsul', '2-3 kali sehari (sesudah makan)', 22000),
(898800008, 'Asamefenamat 100 mg', 'Kapsul', '2-3 kapsul sehari (setelah makan)', 35000),
(898800009, 'Ranitidin HCl', 'Kapsul', '2-3 kali sehari (setelah makan)', 30000),
(898800010, 'Albendazole', 'Kapsul Bubuk', '20 mg/dosus 2-3 x sehari (setelah makan)', 52000),
(898800011, 'Aspirin 100 mg (1 kaplet)', 'Kapsul', '2-3 kali sehari (sesudah makan)', 125000),
(898800012, 'Amoxcilin 100 mg', 'Kapsul', '2-3 x sehari (setelah makan)', 28000),
(898800013, 'Laserin', 'Sirup', '2-3 x sehari 50 ml ', 15000),
(898800014, 'Amoxcilin 100 mg', 'Kapsul', '2-3 kali sehari setelah makan', 20000);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `id_pasien` int(22) NOT NULL,
  `nama_pasien` varchar(49) NOT NULL,
  `usia` int(4) NOT NULL,
  `jk_pasien` enum('Laki-Laki','Perempuan') NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `keluhan` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `usia`, `jk_pasien`, `alamat`, `keluhan`) VALUES
(9880001, 'Suryanto', 38, 'Laki-Laki', 'Malang', 'Pusing dan mual'),
(9880002, 'Didik', 29, 'Laki-Laki', 'Pasuruan', 'Sesak'),
(9880003, 'Suhartono', 43, 'Laki-Laki', 'Blitar', 'Mual dan muntah muntah'),
(9880004, 'Hendro', 38, 'Laki-Laki', 'Malang', 'Lemas'),
(9880005, 'Lilik', 41, 'Perempuan', 'Kediri', 'Tidak nafsu makan'),
(9880006, 'Bambang', 42, 'Laki-Laki', 'Malang', 'Berat badan berkurang drastis'),
(9880007, 'Hendro', 42, 'Laki-Laki', 'Pasuruan', 'Sakit di bagian atas perut'),
(9880008, 'Sunarmi', 38, 'Perempuan', 'Malang', 'Sakit di bagian dada saat menghirup nafas'),
(9880009, 'Sulis', 32, 'Perempuan', 'Sidoarjo', 'Demam'),
(9880010, 'Tutik', 37, 'Perempuan', 'Mojokerto', 'Sesak'),
(9880011, 'Sumiatun', 52, 'Perempuan', 'Magetan', 'Sakit di bagian perut'),
(9880012, 'Maryoto', 54, 'Laki-Laki', 'Kediri', 'Diare'),
(9880013, 'Sulastri', 39, 'Perempuan', 'Pasuruan', 'Pusing'),
(9880014, 'Sudarti', 33, 'Perempuan', 'Sidoarjo', 'Sesak'),
(9880015, 'Suprihatin', 41, 'Perempuan', 'Blitar', 'Pusing'),
(9880016, 'Hermawan', 35, 'Laki-Laki', 'Sidoarjo', 'Sakit pada kepala bagian belakang'),
(9880017, 'Lina', 24, 'Perempuan', 'Kediri', 'Sakit kepala'),
(9880018, 'Ajeng', 20, 'Perempuan', 'Surabaya', 'Tidak nafsu makan'),
(9880019, 'Ratna', 22, 'Perempuan', 'Surabaya', 'Pusing, dan diare'),
(9880020, 'Alfi', 21, 'Perempuan', 'Blitar', 'Pusing'),
(9880021, 'Bandi', 51, 'Laki-Laki', 'Blitar', 'Pusing'),
(9880022, 'Nardi', 31, 'Laki-Laki', 'Pacitan', 'Diare'),
(9880023, 'Samsul', 36, 'Laki-Laki', 'Malang', 'Saat makan selalu muntah'),
(9880024, 'Vina', 22, 'Perempuan', 'Malang', 'Sakit pada kepala bagian belakang'),
(9880025, 'Khoirul', 22, 'Laki-Laki', 'Surabaya', 'Diare'),
(9880026, 'Mujiono', 56, 'Laki-Laki', 'Madiun', 'Batuk terus menerus'),
(9880028, 'Yono', 42, 'Laki-Laki', 'Blitar', 'Pusing'),
(9880029, 'Arina', 21, 'Perempuan', 'Magetan', 'Nyeri pada bagian atas perut'),
(9880030, 'Wahyudi', 53, 'Laki-Laki', 'Situbondo', 'Penglihatan buram'),
(9880031, 'Mulyono', 51, 'Laki-Laki', 'Magelang', 'Mual muntah'),
(9880032, 'Heri', 39, 'Laki-Laki', 'Probolinggo', 'Mual'),
(9880033, 'Rudi', 32, 'Laki-Laki', 'Blitar', 'Sakit tenggorokan'),
(9880034, 'Wahono', 45, 'Laki-Laki', 'Surabaya', 'Sesak untuk bernafas'),
(9880035, 'Muhadi', 63, 'Laki-Laki', 'Malang', 'Batuk pilek'),
(9880036, 'Munir', 52, 'Perempuan', 'Kediri', 'Perut terasa nyeri'),
(9880037, 'Mudi', 52, 'Laki-Laki', 'Blitar', 'Nyeri pada punggung');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `no_bayar` int(11) NOT NULL,
  `no_resep` int(11) NOT NULL,
  `status` enum('-','Sudah Bayar','Belum Bayar') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`no_bayar`, `no_resep`, `status`) VALUES
(752880037, 68090046, 'Sudah Bayar'),
(752880039, 68090048, 'Sudah Bayar'),
(752880040, 68090049, 'Sudah Bayar'),
(752880041, 68090050, 'Sudah Bayar'),
(752880042, 68090051, 'Sudah Bayar'),
(752880043, 68090052, 'Sudah Bayar'),
(752880044, 68090053, 'Sudah Bayar'),
(752880045, 68090054, 'Sudah Bayar'),
(752880046, 68090055, 'Sudah Bayar'),
(752880047, 68090056, 'Belum Bayar'),
(752880048, 68090057, 'Belum Bayar'),
(752880049, 68090058, 'Belum Bayar'),
(752880050, 68090059, 'Belum Bayar'),
(752880051, 68090060, 'Belum Bayar'),
(752880052, 68090061, 'Belum Bayar'),
(752880053, 68090062, 'Belum Bayar'),
(752880054, 68090063, 'Belum Bayar'),
(752880055, 68090064, 'Belum Bayar'),
(752880056, 68090068, 'Sudah Bayar'),
(752880057, 68090069, 'Sudah Bayar'),
(752880058, 68090070, 'Sudah Bayar'),
(752880059, 68090069, 'Sudah Bayar'),
(752880060, 68090072, 'Belum Bayar'),
(752880062, 68090074, 'Belum Bayar'),
(752880063, 68090075, 'Belum Bayar'),
(752880065, 68090077, 'Belum Bayar');

--
-- Triggers `pembayaran`
--
DELIMITER $$
CREATE TRIGGER `hapus_resep` AFTER DELETE ON `pembayaran` FOR EACH ROW BEGIN
DELETE FROM resep WHERE no_resep = old.no_resep;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `perawat`
--

CREATE TABLE `perawat` (
  `id_perawat` int(9) NOT NULL,
  `nama_perawat` varchar(20) NOT NULL,
  `tgl_lahir_perawat` date DEFAULT NULL,
  `jk_perawat` enum('Laki-Laki','Perempuan') NOT NULL,
  `no_telp` varchar(13) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `username` varchar(12) NOT NULL,
  `password` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `perawat`
--

INSERT INTO `perawat` (`id_perawat`, `nama_perawat`, `tgl_lahir_perawat`, `jk_perawat`, `no_telp`, `alamat`, `username`, `password`) VALUES
(224001, 'admin', '2002-09-09', 'Laki-Laki', '081259604478', 'Surabaya', 'admin', 'admin'),
(224002, 'user', '2000-03-07', 'Laki-Laki', '081259609942', 'Surabaya', 'user', 'user'),
(224003, 'vincent', '2002-11-03', 'Laki-Laki', '085608337254', 'Blitar', 'vincent', 'chn'),
(224004, 'chandra', '2004-12-26', 'Laki-Laki', '081254905534', 'Malang', 'chandra', 'chn'),
(224005, 'sasa', '2002-06-18', 'Perempuan', '081534506609', 'Malang', 'sasa', 'sasa'),
(224006, 'ultramen', '2001-06-11', 'Laki-Laki', '081254904450', 'Malang', 'ultramen', '123'),
(224007, 'admin1', '2001-09-13', 'Perempuan', '085559800092', 'Surabaya', 'admin1', 'admin1'),
(224008, 'Susi', '2002-10-09', 'Perempuan', '086543258890', 'Surabaya', 'susi', 'susi');

-- --------------------------------------------------------

--
-- Table structure for table `resep`
--

CREATE TABLE `resep` (
  `no_resep` int(11) NOT NULL,
  `tgl_resep` date DEFAULT NULL,
  `id_pasien` int(22) NOT NULL,
  `no_obat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `resep`
--

INSERT INTO `resep` (`no_resep`, `tgl_resep`, `id_pasien`, `no_obat`) VALUES
(68090046, '2022-06-08', 9880001, 898800002),
(68090048, '2022-06-08', 9880002, 898800005),
(68090049, '2022-06-08', 9880003, 898800005),
(68090050, '2022-06-08', 9880004, 898800003),
(68090051, '2022-06-08', 9880005, 898800010),
(68090052, '2022-06-08', 9880006, 898800003),
(68090053, '2022-06-08', 9880007, 898800012),
(68090054, '2022-06-08', 9880009, 898800007),
(68090055, '2022-06-08', 9880010, 898800011),
(68090056, '2022-06-08', 9880011, 898800011),
(68090057, '2022-06-08', 9880012, 898800008),
(68090058, '2022-06-08', 9880013, 898800008),
(68090059, '2022-06-08', 9880014, 898800009),
(68090060, '2022-06-08', 9880015, 898800006),
(68090061, '2022-06-08', 9880016, 898800006),
(68090062, '2022-06-08', 9880017, 898800008),
(68090063, '2022-06-08', 9880018, 898800006),
(68090064, '2022-06-08', 9880019, 898800007),
(68090068, '2022-06-08', 9880020, 898800002),
(68090069, '2022-06-08', 9880021, 898800002),
(68090070, '2022-06-08', 9880032, 898800003),
(68090071, '2022-06-08', 9880021, 898800003),
(68090072, '2022-06-08', 9880025, 898800002),
(68090074, '2022-06-09', 9880035, 898800003),
(68090075, '2022-06-09', 9880036, 898800008),
(68090077, '2022-06-09', 9880037, 898800009);

--
-- Triggers `resep`
--
DELIMITER $$
CREATE TRIGGER `auto_insert` AFTER INSERT ON `resep` FOR EACH ROW BEGIN
INSERT INTO pembayaran (no_resep, status)
VALUES (NEW.no_resep, 'Belum Bayar');
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `hapus_periksa` AFTER DELETE ON `resep` FOR EACH ROW BEGIN
DELETE FROM diagnosa WHERE id_pasien = old.id_pasien;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `diagnosa`
--
ALTER TABLE `diagnosa`
  ADD PRIMARY KEY (`no_diagnosa`),
  ADD KEY `id_dokter` (`id_dokter`,`id_pasien`),
  ADD KEY `id_pasien` (`id_pasien`);

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`id_dokter`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`no_obat`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`no_bayar`),
  ADD KEY `no_resep` (`no_resep`);

--
-- Indexes for table `perawat`
--
ALTER TABLE `perawat`
  ADD PRIMARY KEY (`id_perawat`);

--
-- Indexes for table `resep`
--
ALTER TABLE `resep`
  ADD PRIMARY KEY (`no_resep`),
  ADD KEY `id_pasien` (`id_pasien`),
  ADD KEY `no_obat` (`no_obat`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `diagnosa`
--
ALTER TABLE `diagnosa`
  MODIFY `no_diagnosa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33500032;

--
-- AUTO_INCREMENT for table `dokter`
--
ALTER TABLE `dokter`
  MODIFY `id_dokter` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=808815;

--
-- AUTO_INCREMENT for table `obat`
--
ALTER TABLE `obat`
  MODIFY `no_obat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=898800016;

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id_pasien` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9880039;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `no_bayar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=752880066;

--
-- AUTO_INCREMENT for table `perawat`
--
ALTER TABLE `perawat`
  MODIFY `id_perawat` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=224009;

--
-- AUTO_INCREMENT for table `resep`
--
ALTER TABLE `resep`
  MODIFY `no_resep` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68090078;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `diagnosa`
--
ALTER TABLE `diagnosa`
  ADD CONSTRAINT `diagnosa_ibfk_2` FOREIGN KEY (`id_pasien`) REFERENCES `pasien` (`id_pasien`),
  ADD CONSTRAINT `diagnosa_ibfk_3` FOREIGN KEY (`id_dokter`) REFERENCES `dokter` (`id_dokter`);

--
-- Constraints for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `pembayaran_ibfk_1` FOREIGN KEY (`no_resep`) REFERENCES `resep` (`no_resep`);

--
-- Constraints for table `resep`
--
ALTER TABLE `resep`
  ADD CONSTRAINT `resep_ibfk_1` FOREIGN KEY (`id_pasien`) REFERENCES `diagnosa` (`id_pasien`),
  ADD CONSTRAINT `resep_ibfk_2` FOREIGN KEY (`no_obat`) REFERENCES `obat` (`no_obat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
