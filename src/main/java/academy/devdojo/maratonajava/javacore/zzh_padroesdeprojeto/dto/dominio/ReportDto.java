package academy.devdojo.maratonajava.javacore.zzh_padroesdeprojeto.dto.dominio;

import academy.devdojo.maratonajava.javacore.zzh_padroesdeprojeto.factory.dominio.Country;

public class ReportDto {
    private String aircraftName;
    private Country country;
    private String currency;
    private String personName;


    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Country country;
        private String currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.country = this.country;
            reportDto.aircraftName = this.aircraftName;
            reportDto.currency = this.currency;
            reportDto.personName = this.personName;
            return reportDto;
        }
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currency='" + currency + '\'' +
                ", personName='" + personName + '\'' +
                '}';
    }
}
