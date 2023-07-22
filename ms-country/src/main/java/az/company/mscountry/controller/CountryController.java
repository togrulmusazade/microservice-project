package az.company.mscountry.controller;

import az.company.mscountry.model.CountryResponse;
import az.company.mscountry.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping
    public List<CountryResponse> getAllAvailableCountries(@RequestParam String currency) {
        return countryService.getAllAvailableCountries(currency);
    }

}



