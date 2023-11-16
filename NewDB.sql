USE [DA_BANGIAY]
GO
/****** Object:  Table [dbo].[Anh]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Anh](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Anh] [image] NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
 CONSTRAINT [PK_Anh] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChatLieu]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChatLieu](
	[ID] [int] NOT NULL,
	[TenCL] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
 CONSTRAINT [PK_ChatLieu] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[ID] [varchar](50) NOT NULL,
	[ChucVu] [bit] NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
 CONSTRAINT [PK_ChucVu] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DayGiay]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DayGiay](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ten] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
 CONSTRAINT [PK_DayGiay] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DeGiay]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DeGiay](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[LoaiDeGiay] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
 CONSTRAINT [PK_DeGiay] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HinhThucThanhToan]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HinhThucThanhToan](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_ThanhToan] [int] NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
 CONSTRAINT [PK_HinhThucThanhToan] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_KhachHang] [nvarchar](50) NULL,
	[ID_NhanVien] [nvarchar](50) NULL,
	[ID_HinhThucThanhToan] [int] NULL,
	[ID_PhieuGiamGia] [int] NULL,
	[HoTen] [nvarchar](50) NULL,
	[SoDT] [varchar](50) NULL,
	[DiaChi] [nvarchar](50) NULL,
	[ThanhTien] [float] NULL,
	[NgayGiaoHang] [date] NULL,
	[NgayNhanHang] [date] NULL,
	[TrangThai] [bit] NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[ID_HoaDon] [int] NULL,
	[ID_SanPham] [int] NULL,
	[SoLuong] [int] NULL,
	[DonGia] [float] NULL,
 CONSTRAINT [PK_HoaDonChiTiet] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[ID] [nvarchar](50) NOT NULL,
	[HoTen] [nvarchar](50) NULL,
	[GioiTinh] [bit] NULL,
	[SoDT] [varchar](50) NULL,
	[Email] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KichCo]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KichCo](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[KichCo] [int] NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
 CONSTRAINT [PK_KichCo] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MauSac]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MauSac](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MauSac] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
 CONSTRAINT [PK_MauSac] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[ID] [nvarchar](50) NOT NULL,
	[ID_ChucVu] [varchar](50) NULL,
	[MaNV] [varchar](50) NULL,
	[HoTen] [nvarchar](50) NULL,
	[GioiTinh] [bit] NULL,
	[NgaySinh] [date] NULL,
	[SoDT] [varchar](50) NULL,
	[Email] [nvarchar](50) NULL,
	[MatKhau] [varchar](50) NULL,
	[MaOTP] [varchar](50) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[TrangThai] [bit] NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuGiamGia]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuGiamGia](
	[ID] [int] NULL,
	[ID_NhanVien] [nvarchar](50) NULL,
	[PhieuGiamGia] [nvarchar](50) NULL,
	[GiaTri] [float] NULL,
	[MoTa] [nvarchar](50) NULL,
	[NgayBatDau] [date] NULL,
	[NgayKetThuc] [date] NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MaSP] [varchar](50) NULL,
	[TenSP] [nvarchar](50) NULL,
	[SoLuong] [int] NULL,
	[GiaBan] [float] NULL,
	[MoTa] [nvarchar](50) NULL,
	[XuatXu] [nvarchar](50) NULL,
	[TrangThai] [bit] NULL,
	[ID_ChatLieu] [int] NULL,
	[ID_DayGiay] [int] NULL,
	[ID_MauSac] [int] NULL,
	[ID_KichCo] [int] NULL,
	[ID_Anh] [int] NULL,
	[ID_ThuongHieu] [int] NULL,
	[ID_DeGiay] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThanhToan]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThanhToan](
	[ID] [int] NULL,
	[MaGiaoDich] [varchar](50) NULL,
	[HinhThuc] [bit] NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThuongHieu]    Script Date: 11/16/2023 4:03:16 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThuongHieu](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[TenThuongHieu] [nvarchar](50) NULL,
	[NgayTao] [date] NULL,
	[NgaySua] [date] NULL,
	[NguoiTao] [int] NULL,
	[NguoiSua] [int] NULL,
 CONSTRAINT [PK_ThuongHieu] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Anh] ADD  CONSTRAINT [DF_Anh_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Anh] ADD  CONSTRAINT [DF_Anh_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[ChatLieu] ADD  CONSTRAINT [DF_ChatLieu_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[ChatLieu] ADD  CONSTRAINT [DF_ChatLieu_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[ChucVu] ADD  CONSTRAINT [DF_ChucVu_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[ChucVu] ADD  CONSTRAINT [DF_ChucVu_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[DayGiay] ADD  CONSTRAINT [DF_DayGiay_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[DayGiay] ADD  CONSTRAINT [DF_DayGiay_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[DeGiay] ADD  CONSTRAINT [DF_DeGiay_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[DeGiay] ADD  CONSTRAINT [DF_DeGiay_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[HinhThucThanhToan] ADD  CONSTRAINT [DF_HinhThucThanhToan_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[HinhThucThanhToan] ADD  CONSTRAINT [DF_HinhThucThanhToan_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[HoaDon] ADD  CONSTRAINT [DF_HoaDon_NgayGiaoHang]  DEFAULT (getdate()) FOR [NgayGiaoHang]
GO
ALTER TABLE [dbo].[HoaDon] ADD  CONSTRAINT [DF_HoaDon_NgayNhanHang]  DEFAULT (getdate()) FOR [NgayNhanHang]
GO
ALTER TABLE [dbo].[HoaDon] ADD  CONSTRAINT [DF_HoaDon_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[HoaDon] ADD  CONSTRAINT [DF_HoaDon_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[KhachHang] ADD  CONSTRAINT [DF_KhachHang_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[KhachHang] ADD  CONSTRAINT [DF_KhachHang_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[KichCo] ADD  CONSTRAINT [DF_KichCo_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[KichCo] ADD  CONSTRAINT [DF_KichCo_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[MauSac] ADD  CONSTRAINT [DF_MauSac_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[MauSac] ADD  CONSTRAINT [DF_MauSac_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[NhanVien] ADD  CONSTRAINT [DF_NhanVien_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[NhanVien] ADD  CONSTRAINT [DF_NhanVien_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[SanPham] ADD  CONSTRAINT [DF_SanPham_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[SanPham] ADD  CONSTRAINT [DF_SanPham_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[ThanhToan] ADD  CONSTRAINT [DF_ThanhToan_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[ThanhToan] ADD  CONSTRAINT [DF_ThanhToan_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
ALTER TABLE [dbo].[ThuongHieu] ADD  CONSTRAINT [DF_ThuongHieu_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[ThuongHieu] ADD  CONSTRAINT [DF_ThuongHieu_NgaySua]  DEFAULT (getdate()) FOR [NgaySua]
GO
